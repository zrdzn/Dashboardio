import { Layout } from '@/components/Layout';
import Head from 'next/head';
import React from 'react';
import { ReactJSXElement } from '@emotion/react/types/jsx-namespace';
import {Flex} from "@chakra-ui/layout";
import {Widget, WidgetProperties} from "@/components/Widget";
import {
  ListItem,
  OrderedList,
  Table,
  TableCaption,
  TableContainer,
  Tbody,
  Td,
  Tfoot,
  Th,
  Thead,
  Tr
} from "@chakra-ui/react";

const widgets: Array<WidgetProperties> = [
  {
    title: 'Placed Blocks',
    content: <>Todo</>
  },
  {
    title: 'Broken Blocks',
    content: <>Todo</>
  },
  {
    title: 'Last Placed Blocks',
    content: <>Todo</>
  },
  {
    title: 'Last Broken Blocks',
    content: <>Todo</>
  },
  {
    title: 'Last Changed Blocks',
    content:
      <>
        <TableContainer>
          <Table>
            <TableCaption>View All</TableCaption>
            <Thead>
              <Tr>
                <Th>Num</Th>
                <Th>Source Block</Th>
                <Th>Target Block</Th>
                <Th>X</Th>
                <Th>Y</Th>
              </Tr>
            </Thead>
            <Tbody>
              <Tr>
                <Td>1</Td>
                <Td>Burner Inserter</Td>
                <Td>Inserter</Td>
                <Td>51</Td>
                <Td>23</Td>
              </Tr>
              <Tr>
                <Td>2</Td>
                <Td>Wooden Chest</Td>
                <Td>Iron Chest</Td>
                <Td>39</Td>
                <Td>94</Td>
              </Tr>
              <Tr>
                <Td>3</Td>
                <Td>Rail Signal</Td>
                <Td>Rain Chain Signal</Td>
                <Td>12</Td>
                <Td>67</Td>
              </Tr>
              <Tr>
                <Td>4</Td>
                <Td>Stone Brick</Td>
                <Td>Concrete</Td>
                <Td>23</Td>
                <Td>12</Td>
              </Tr>
              <Tr>
                <Td>5</Td>
                <Td>Red Wire</Td>
                <Td>Green Wire</Td>
                <Td>65</Td>
                <Td>34</Td>
              </Tr>
            </Tbody>
          </Table>
        </TableContainer>
      </>
  },
]
/*
    "id"             serial,
    "action_id"      integer NOT NULL UNIQUE,
    "block_name"     text NOT NULL,
    "x"              integer NOT NULL,
    "y"              integer NOT NULL,
 */

export default function ServerDashboard(): ReactJSXElement {
  return (
    <Layout>
      <Head>
        <title>Dashboardio - Factory Overview</title>
      </Head>
      <Flex direction={'row'}>
        {widgets.map((widget) => {
          return (
            <Widget key={widget.title} title={widget.title} content={widget.content} />
          )}
        )}
      </Flex>

    </Layout>
  );
}